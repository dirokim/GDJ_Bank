const btn3 = document.getElementById("btn3");
const replyAdd = document.getElementById("replyAdd");
const replyForm = document.getElementById("replyForm");
const replyList = document.getElementById("replyList");
const frm  = document.getElementById("frm");
const up = document.getElementById("up");
const more = document.getElementById("more");
const create = document.getElementById("create");
// replyList.addEventListener("click",(e)=>{
//     if(e.target.getAttribute("id")=='more'){
//         alert("test");
//         let p = e.target.getAttribute("data-replyList-page");
        
//         fetch("/reply/list?productNum="+productNum.value+"&page="+(p*1+1),{
    
//             method:"GET"
        
//         }).then(reso=>reso.text())
//         .then(reso=>{
//             console.log(productNum.value);
//             $("#replyList").html(reso);
//         })
//     }
// })

getReplyList(1,up.getAttribute("data-product-num"));

//더보기
more.addEventListener("click",()=>{

       
       if(p>a){
        alert("마지막 페이지입니다");

       }

       getReplyList(p,up.getAttribute("data-product-num"));


    
})
//리스트 가져오는 함수
function getReplyList(page,num){

   fetch("../reply/list?page="+page+"&productNum="+num,{
        method:"GET",
        
   }).then(r=>r.json())
   .then(r=>{
        

        makeList(r)

        
       
     
   })
}


//리스트 만드는 함수
function makeList(r){
    more.setAttributd("data-relpyList-page",(r.pager.page*1)+1);
    more.setAttributd("data-relpyList-totalPage",r.pager.totalPage);
    let userName = replyList.setAttribute("data-user");
    r= r.datas;
   for(let i=0; i <r.length;i++){
    let  tr =  document.createElement("tr");
    let  td =  document.createElement("td");
       td.innerText = r[i].replyContents;
       tr.append(td);
       
       td =  document.createElement("td");
       td.innerText = r[i].userName;
       tr.append(td);

       td =  document.createElement("td");
       let d = new Date(r[i].replyDate);

       td.innerText = d.getFullYear+"."+(d.getMonth()+1)+"."+d.getDate();
       tr.append(td);

       if(userName == r[i].userName) {
       td = document.createElement("td");
       let b = document.createElement("button");
       b.innerHTML = "삭제";
       b.setAttribute("class","del");
       b.setAttribute("data-replyNum",r[i].replyNum);
       td.append(b);
       tr.append(td);

       td = document.createElement("td");
        b = document.createElement("button");
       b.innerHTML = "수정";
       b.setAttribute("class","update");
       b.setAttribute("data-replyNum",r[i].replyNum);
       td.append(b);
       tr.append(td);
       }
       replyList.append(tr);
       
    }
   
}



// fetch("/reply/list?productNum="+productNum.value,{
    
//     method:"GET"

// }).then(reso=>reso.text())
// .then(reso=>{
//     console.log(productNum.value);
//     $("#replyList").html(reso);
// })



//삭제 버튼
$("#replyList").on("click",".del",function(){
    let n = $(this).attr("data-replyNum");
    fetch("../reply/delete",{
        method:"POST",
        body:"replyNum:"+n+",productNum:"+up.getAttribute("data-product-num")
       
    }).then(r=>r.json())
    .then(r=>{
        replyList.innerHTML="";
        makeList(r);
    })
})



//댓글 등록
replyAdd.addEventListener("click",()=>{
    let form = new FormData(replyForm);
    fetch("/reply/add",{
        method:"POST",
        body:form
    }).then(res=>res.json())
    .then(res=>{
        replyList.innerHTML="";
        makeList(res);
        replyForm.reset();
    });

    more.setAttributd("data-replyList-page",1); 
})

    
//  $("#replybtn").click(function(){
//     $.ajax({
//         url:"/reply/add",
//         method:"POST",
//         body:{from},
//         success:function(result){
//             if(result>0){
//                 alert("등록 성공");
//             }
//         },
//         error:function(){

//         }

//     })

//  })

btn3.addEventListener("click",()=>{
    // fetch("/wishlist/add?productNum="+$('#productNum').val(),{
    //     method:"GET"
    // }).then(response=>{return response.text()})
    // .then(response=>{
    //     let result = response.trim();
    //     if(result==1){
    //         alert("등록 성공");
    //        if(confirm("장바구니로 가시겠습니까 ?")){
    //             location.href="/wishlist/list";
    //        }
    //     }else{
    //         alert ("등록 실패");
    //         location.href="/product/list";
    //     }
    // })

    let productNum = $('#productNum').val();
    $.ajax({
        url:"/wishlist/add",
        method:"GET",
        data:{
            productNum:productNum
        },
        success:function(result){
            let num = result.trim();
            if(num==1){
                alert('등록 성공');
                if(confirm("장바구니로 가시겠습니가?")){
                    location.href="/wishlist/list";
                }else{
                    location.href="/product/list";
                }
            }else{
                alert("등록 실패");
                location.href="/product/list";
            }
        },
        error:function(){
            alert("에러!!!관리자한테 문의 ㄱ")
        }


    });


})  