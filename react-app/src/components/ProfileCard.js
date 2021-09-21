import React from "react";
import "./ProfileCard.css";

function ProfileCard() {
  return (
    <div className="col-xs-6 col-md-4 card-container">
      <div className="card">
        <img
          className="card-image"
          src="../../images/face_1_nobg 4.png"
          alt="John"
        />
        <h1 className="card-title">Nume Prenume</h1>
        <p className="card-subtitle">rol/functie</p>
      </div>
    </div>
  );
}

export default ProfileCard;
