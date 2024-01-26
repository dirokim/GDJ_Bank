const checkAll = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");



$("$btn2").click(function(){
    $("$deleteForm").attr("action","/account/add");
    $("$deleteForm").submit();
});



$('#checkAll').click(()=>{
    let v = $("#checkAll").prop("checked");
    
    $('.checks').prop("checked", v);
});

$('.checks').click(function(){
    let flag=true;
    
    $('.checks').each(function(idx, c){
        
        if(!$(c).prop('checked')){
            flag=!flag;
            return false;
        }
    });

    $("#checkAll").prop("checked", flag);
})

// const btn = document.getElementById("btn");
// const result = [];
// btn.addEventListener("click",()=>{
//     for(let c of checks){
//         if(c.checked==true){
//             console.log(c.value);
//             result.push(c.value);
//             console.log(result.length);
//         }
//   }

//   fetch(url="/wishlist/delete",{
//     method:"POST",
//     body:result

//   }).then(response=>{return response.text()})
//   .then(response=>{
//      let res = response.trim();
//      if(res==1){
//         alert("삭제 되었습니다");
//         location.href="/wishlist/list";
//      }else{
//         alert("삭제 실패");
//         location.href="/";
//      }
//   })

// })

let nums=[];
// let checkEl=[];
$("#btn").click(function(){
    $(".checks").each(function(idx,item){
        if($(item).prop("checked")){
            nums.push($(item).val());
            console.log(nums);
            // checkEl.push($(item).val());
            // item.parentNode.parentNode.parentNode.remove();
            

            //2번쨰
            // checkEl.forEach((element)=>{
            //     $(element).parent().parent().parent().remove();

            // })

            //3번쨰 db에서 다시 조회에서 html 을 다시 뿌려준다  


        }
    })

   deletewithJquery(nums);
    // deletewithFetch(nums);
})

// function deletewithFetch(nums){
    // let param ="";
    // nums.array.forEach(element => {
    //     param= param+"productNum="+element+"%";
    // });
    
//     let deleteForm = document.getElementById("deleteForm");
//     let form = new FormData(deleteForm);





//     fetch("./delete",{
//         method:"Post",
//         body:form
        
//     }).then(response=>{return response.text()})
//     .then(response=>{
//         let tr = document.getElementById("tbody");
//         tr.innerHTML = response;
//     })
// }

let form = new FormData("#deleteForm")[0];

function deletewithJquery(){
    $.ajax({
        method:"POST",
        url:"./delete",
        traditional:true,
        contentType:false,
        processData:false,
        data:{
            form
        },
        success:function(res){
            $("#tbody").html(res);
        },
        error:function(){
            alert("알수없는 에러발생");
            location.reload();
        }
    })
}


// $('#btn3').click(function(){
//     $(".checks").each(function(idx,item){
//         nums.push($(item).val());
        
//     })
//     $.ajax({
//         method:"POST",
//         url:"./delete",
//         traditional:true,
//         data:{
//             productNum:nums
//         },
//         success:function(res){
//             res.trim();
//             if(res>0){
//             alert("삭제 성공");
//             location.reload();
//             }
//         },
//         error:function(){
//             alert("알수없는 에러발생");
//             location.reload();
//         }
//     })
// })


