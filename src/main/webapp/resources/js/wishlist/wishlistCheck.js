const checkAll = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");

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
let checkEl=[];
$("#btn").click(function(){
    $(".checks").each(function(idx,item){
        if($(item).prop("checked")){
            nums.push($(item).val());
            console.log(nums);
            
            item.parentNode.parentNode.parentNode.remove();
        }
    })



    // $(".checks").each(function(idx,item){
    //     if($(item).prop("checked")){
    //         item.parentNode.parentNode.parentNode.remove();

    //     }
    // })






    $.ajax({
        method:"POST",
        url:"./delete",
        traditional:true,
        data:{
            productNum:nums
        },
        success:function(res){
            res.trim();
            if(res>0){
            alert("삭제 성공");
            location.reload();
            }
        },
        error:function(){
            alert("알수없는 에러발생");
            location.reload();
        }
    })
})




$('#btn3').click(function(){
    $(".checks").each(function(idx,item){
        nums.push($(item).val());
        
    })
    $.ajax({
        method:"POST",
        url:"./delete",
        traditional:true,
        data:{
            productNum:nums
        },
        success:function(res){
            res.trim();
            if(res>0){
            alert("삭제 성공");
            location.reload();
            }
        },
        error:function(){
            alert("알수없는 에러발생");
            location.reload();
        }
    })
})


