const express = require('express')

const app = express(); 

const port = 8080

class Post {
  constructor(postId, pic, caption, userTag, likes) {
    this.postId = postId;
    this.pic = pic;
    this.caption = caption;
    this.userTag = userTag;
    this.likes = likes;
  }
}

app.get('/getAllUsers', (req, res) => {
	const post1 = new Post(1, 'postPic1.png', 'Beautiful sunset!', '@alice', 120);
	const post2 = new Post(2, 'postPic2.png', 'Amazing food!', '@alice', 80);
	const post3 = new Post(3, 'postPic3.png', 'Great adventure!', '@bob', 200);
	const posts = [post1, post2, post3]; 
	console.log(posts); 
	res.send(posts); 
}) 

app.listen(port, ()=> {
	console.log(`Example app listening port ${port}`)
}) 


