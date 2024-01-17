const pager = document.getElementsByClassName("pager");
const searchForm = document.getElementById("searchForm");
const page = document.getElementById("page");
const kind = document.getElementById("kind");
const a = document.getElementsByClassName("a");

let k = kind.getAttribute("data-kind");
for(i=0;i<a.length;i++){
    if(a[i].value==k){
        a[i].setAttribute("selected",true);
        break;
    }
}


for(i=0;i<pager.length;i++){
    pager[i].addEventListener("click",(e)=>{
        console.log(this);
        let p = e.target.getAttribute("data-page");
        page.value=p;
        searchForm.onsubmit();

    })
      
    
}

// for(p of pager){
//     console.log(p);
//     p.addEventListener("click",(e)=>{
//         e.preventDefault();
//         console.log('test');
//        let page = this.getAttribute("data-page");
//        console.log;

//         //searchForm.submit();    

//     })
// }