const btn3 = document.getElementById("btn3");
const replyAdd = document.getElementById("replyAdd");
const replyForm = document.getElementById("replyForm");
const replyList = document.getElementById("replyList");
const productNum = document.getElementById("productNum");



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



more.addEventListener("click",()=>{
    let p = more.getAttribute("data-replyList-page"); //현재 페이지번호
    let a = more.getAttribute("data-replyList-totalPage");//전체페이지 번호
        p= p*1+1;
       
       if(p>a){
        alert("마지막 페이지입니다");

       }
       
       
        more.setAttributd("data-replyList-page",p);

        fetch("/reply/list?productNum="+up.getAttribute("data-replyList-page")+"&page="+p,{
    
            method:"GET"
        
        }).then(reso=>reso.text())
        .then(reso=>{
            $("#replyList").append(reso);

        })


    
})

function getReplyList(page){

   fetch("",{
    
   }) 
}



// fetch("/reply/list?productNum="+productNum.value,{
    
//     method:"GET"

// }).then(reso=>reso.text())
// .then(reso=>{
//     console.log(productNum.value);
//     $("#replyList").html(reso);
// })

replyAdd.addEventListener("click",()=>{
    let form = new FormData(replyForm);
    fetch("/reply/add",{
        method:"POST",
        body:form
    }).then(res=>res.text())
    .then(res=>{$("#replyList").html(res)});

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