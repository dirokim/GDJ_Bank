
// javascript 방법

// const all  = document.getElementById("checkAll");
// const checks = document.getElementsByClassName("checks");
// all.addEventListener("click",()=>{
//        let v = all.getAttribute("checked");
//         console.log("check:",v);
//         v= all.checked;
//         for(let check of checks){
//             check.checked = v;
//         }

   
//  })

//  for(let c of checks){
//     c.addEventListener("click",function(){
//         console.log(this.checked)
//         if(this.checked==false){
//             all.checked = false;
//         }else if(checks!=false){
//             all.checked = true;
//         }

//     })
//  }
// for(let c of checks){
//     c.addEventListener("click",function(){
//         let flag = true;
//         for(let ch of checks){
//         if(!ch.checked){
//             flag=!flag;
//             break;
//         }
//         }
//      all.checked=flag;
    
//     })
// }




// const btn = document.getElementById("btn");
// const req = document.getElementsByClassName("req");
//         btn.addEventListener("click",(e)=>{

//         let flag = true 
//         e.preventDefault();
//         for(let r of req){
//             if(!r.checked){
//                 flag = !flag;
//                 break
//             }
//         }
//         if(flag){
//             location.href = "./join";
//         }else{
//             alert("필수 약관은 동의해야합니다");
//         }
         
//         if(a1.checked=true && a2.checked==true && a3.checked== true ){
//             location.href = "./join";
//         }
       
// })







//  jquery 방법



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




$('#btn').click(function(e){
    e.preventDefault();
    
    let flag=true;

    $('.req').each(function(idx, r){
        if(!$(r).prop('checked')){
            flag=!flag;
            return false;
        }
    });

    if(flag){
        location.href="join";
    }else {
        alert('필수 약관 동의 필요');
    }
});