

async function call() {
	const res = await fetch('http://localhost:8080/getAllUsers')
	const data = await res.json(); 

	console.log(data); 
}


call(); 


