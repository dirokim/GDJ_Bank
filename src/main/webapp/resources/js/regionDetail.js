/**
 * 
 */
	const up = document.getElementById("up");
	up.addEventListener('click',function(){
		frm.setAttribute("action","update");
		frm.setAttribute("method","get");
		//let id = up.getAttribute('data-region-id');
		//location.href="./update?region_id="+id;
		frm.submit();

	})
	
 	const del = document.getElementById("del");
	const frm =document.getElementById("frm");
	del.addEventListener('click',function(){
		let result = confirm("정말 지울거냐??");

		if(result){
			frm.submit();

		}

		
	})


 	