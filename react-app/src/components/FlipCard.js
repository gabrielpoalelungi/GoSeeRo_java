import React from 'react'
import "./FlipCard.css";

function FlipCard() {
    return (
<div className="flip">
    <div className="front" style={{backgroundImage: "url(https://images.pexels.com/photos/540518/pexels-photo-540518.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb)"}}>
       <h1 className="text-shadow">Frontside</h1>
    </div>
    <div className="back">
       <h2>Backside</h2>
       <p>Lorem ipsum</p>
    </div>
</div>
    )
}

export default FlipCard
