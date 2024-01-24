
//자바스크립트

//<div class="input-group">
//<input class="form-control" type="file" name="attachs">
//<span class="input-group-text text-danger" >X</span>
//</div> 
//div > input , span > text X 


// const filelist  = document.getElementById("filelist");
// const fileAdd = document.getElementById("fileAdd");
// const spans =document.getElementsByClassName("text-danger");
// let check = 0;
// fileAdd.addEventListener("click",function(e){
    
//     if(check<5){
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
//     span.classList.add("text-danger del");
//     type.value="file";
//     input.setAttributeNode(type);
//     type=document.createAttribute("name");
//     type.value="attachs";
//     input.setAttributeNode(type);

//     span.appendChild(text);
//     div.appendChild(input);
//     div.appendChild(span);
//     filelist.appendChild(div);
//     check++;

    
// });

// const fileDelete = document.getElementsByClassName("text-danger");

//     for(let i=0 ;i<fileDelete.lengthk;i++){
//         fileDelete[i].addEventListener("click",function(){
//             fileDelete[i].remove();
//         });
//     }


//jquery


//<div class="input-group">
//<input class="form-control" type="file" name="attachs">
//<span class="input-group-text text-danger" >X</span>
//</div> 
let check = 1;
$("#fileAdd").click(function(){
    // let element = '<div class="input-group">';
    // element += '<input class="form-control" type="file" name="attachs">';
    // element += '<span class="input-group-text text-danger" >X</span>';
    // element += '</div>';
    if(check>5){
        alert("5개 까지만 가능합니다");
    }else{
    let element = `<div class="input-group">
    <input class="form-control" type="file" name="attachs">
    <span class="input-group-text text-danger del" >X</span>
    </div>` ;
    
    $("#filelist").append(element);
    }   
    check++;
});

$(".del").click(()=>{
    alert("del 을 클릭했다");
});
