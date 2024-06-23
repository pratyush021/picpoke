import express from 'express'
import { Request, Response, NextFunction } from 'express'


const app = express() 
const port = 8080 

app.use((
	req: Request, 
	res: Response, 
	next: NextFunction ) => {
		console.log(`${req.method} request for '${req.url}' `);
		next(); 
	}
); 

//Root route 
app.get('/', (req: Request, res: Response) => {
	res.send("Root"); 
}); 


app.listen(port, ()=> {
	console.log(`server is running on http://localhost:${port}`); 
}) 
	
