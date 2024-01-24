
let btn = document.getElementById("btn");
let btn2 = document.getElementById("btn2");

btn2.addEventListener("click",function(){
    let t = document.getElementById("title").value;
    let c = document.getElementById("contents").value;
    fetch("/notice/add",{
        method:"POST",
        headers:{
            "Content-type":"application/x-www-form-urlencoded"
        },
        body:"noticeHead="+t+"&noticeContents="+c
    }).then(response=> response.text())
    .then(response=>console.log(response));
    
})

btn.addEventListener("click",()=>{
    
    console.log("Ajax 시작");

    fetch("https://localhost/notice/list",{
        method:"GET",
       

    }).then(response=>{return response.text()})
    .then((res)=>{
        document.getElementById("result").innerHTML=res;
        console.log(res);
    });

    console.log("Ajax 끝");

})