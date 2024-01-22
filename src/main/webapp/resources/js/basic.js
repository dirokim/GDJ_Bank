//js
const b1 = document.getElementById("b1");
const b2 = document.querySelector("#b2");
b1.addEventListener("click",()=>{

})
let v = b1.innerHTML;
b1.innerText='test';
b1.getAttribute("");
b1.setAttribute("속성명","값");
b1.value;
// jquery
//$().action() 
$("#b1").click(()=>{

}); 

$("#b2").html();//text()
$("#b2").html("test");

$("#b1").attr("속성명");
$("#b1").attr("속성명","값");

$("#b1").prop("속성명");
$("#b1").prop("속성명","값");

$("#b1").val();