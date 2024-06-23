

async function call() {
	const res = await fetch('http://localhost:8080/getAllUsers')
	console.log(res)
	if(res.err != null) {
		console.log("FAILED"); 
		return 0; 
	}
	const data = await res.json(); 
	
	console.log(data); 
}


call(); 


