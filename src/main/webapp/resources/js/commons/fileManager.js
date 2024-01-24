
//자바스크립트




// const filelist  = document.getElementById("filelist");
// const fileAdd = document.getElementById("fileAdd");
// const spans =document.getElementsByClassName("text-danger");
// const del = document.getElementsByClassName("del");
// let count = 0;
// let max =5;
// filelist.addEventListener("click",(e)=>{
//     console.log(e);
//     console.log(e.target);
//     console.log(e.currentTarget);
//     if(e.target.classList.contains('del')){
//         e.target.parentNode.remove();
//         count--;
//     };

// })
// for(d of del){
//     d.addEventListener("click",()=>{
//         alert("click");
//     });
// };

// let idx=0;

// fileAdd.addEventListener("click",function(e){
//     idx++
//     if(count<=max){
//     }else {
//         alert("최대 5개 까지만 가능합니다");
//         e.preventDefault();
//         fileAdd.preventDefault();
//     }


//     let div = document.createElement("div");
//     let input = document.createElement("input");
//     let span = document.createElement("span");
//     let text = document.createTextNode("X");
//     let type = document.createAttribute("type");
        
//     div.classList.add("input-group");    
//     input.classList.add("form-control");
//     span.classList.add("input-group-text");
//     span.classList.add("text-danger");
//     span.classList.add("del");
//     type.value="file";
//     input.setAttributeNode(type);
//     type=document.createAttribute("name");
//     type.value="attachs";
//     input.setAttributeNode(type);

//     span.appendChild(text);
//     div.appendChild(input);
//     div.appendChild(span);
//     filelist.appendChild(div);
//     count++;

    
// });



//jquery



let count = $("#filelist").attr(data-file-count);
let max = $("#filelist").attr(data-file-max);

$("#filelist").on("click",".del",()=>{
    $(this).parent().remove();
    count--;
})

$("#fileAdd").click(function(){

    if(count>=max){
        alert("5개 까지만 가능합니다");
        return;
    }
    let element = `<div class="input-group">
    <input class="form-control" type="file" name="attachs">
    <span class="input-group-text text-danger del" >X</span>
    </div>` ;
    
    $("#filelist").append(element);
      
    check++;
});

$(".del").click(()=>{
    alert("del 을 클릭했다");
});
