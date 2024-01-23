
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

//         btn.addEventListener("click",(e)=>{

//         e.preventDefault();
//         if(all.checked==true){
//             location.href = "./join";
//         }
       
// })












 $('#checkAll').click(()=>{
   let v =  $("#checkAll").prop("checked");
    $('.checks').prop("checked",v);

})

$('.checks').click(function(){
    let flag=true;

    $('.'+'checks').each(function(idx,c){
        if($(c).prop('checked')){
            flag=!flag;
            return false;
        }
})
    $("#checkAll").prop("checked",flag);
})

$('#btn').click((event)=>{
    event.preventDefault();
    if($('#checkAll').prop('checked')){
        location.href = "./join";
    }
})

