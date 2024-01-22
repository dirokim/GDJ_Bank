
const all  = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");
all.addEventListener("click",()=>{
       let v = all.getAttribute("checked");
        console.log("check:",v);
        v= all.checked;
        for(let check of checks){
            check.checked = v;
        }

   
 })

 for(let c of checks){
    c.addEventListener("click",function(){
        console.log(this.checked)
        if(this.checked==false){
            all.checked = false;
        }else if(checks!=false){
            all.checked = true;
        }

    })
 }

//  $('#checkAll').click(()=>{
//    let v =  $("#checkAll").prop("checked");
//     $('.checks').prop("checked",v);

// })

// $('.checks').click(function(){
//     if($(this.prop('checked')==false)){
//         $("#checkAll").prop("checked",true)
//     }else if ($("#checkAll").prop('checked')!=false){
//         $("#checkAll").prop("checked",false)
//     }
// })