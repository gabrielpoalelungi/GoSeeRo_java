import React, { useState } from "react";
import "./ContactForm.css";
import Input from "./inputs/Input";
import Textarea from "./inputs/Textarea";

function ContactForm() {
  const [nume, setNume] = useState("");
  const [email, setEmail] = useState("");
  const [telefon, setTelefon] = useState("");
  const [judet, setJudet] = useState("");
  const [mesaj, setMesaj] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const userDetails = {
      nume,
      email,
      telefon,
      judet,
      mesaj,
    };
    console.log(userDetails);
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <div className="row">
          <div className="col-10 col-md-6">
            <Input
              labelText={"Nume"}
              inputName={"nume"}
              inputType={"nume"}
              inputValue={nume}
              handleChange={(e) => setNume(e.target.value)}
            />
          </div>
          <div className="col-10 col-md-6">
            <Input
              labelText={"Email"}
              inputName={"email"}
              inputType={"email"}
              inputValue={email}
              handleChange={(e) => setEmail(e.target.value)}
            />
          </div>
        </div>
        <div className="col-10 col-md-12">
          <Input
            labelText={"Telefon"}
            inputName={"telefon"}
            inputType={"text"}
            inputValue={telefon}
            handleChange={(e) => setTelefon(e.target.value)}
          />
        </div>
        <div className="col-10 col-md-12">
          <Input
            labelText={"Judet"}
            inputName={"judet"}
            inputType={"text"}
            inputValue={judet}
            handleChange={(e) => setJudet(e.target.value)}
          />
        </div>
        <div className="col-10 col-md-12">
          <Textarea
            labelText={"Mesaj"}
            inputName={"mesaj"}
            inputType={"text"}
            inputValue={mesaj}
            handleChange={(e) => setMesaj(e.target.value)}
          />
        </div>
        <div className="form-group-submit">
          <input type="submit" value="Trimite mesajul" />
        </div>
      </form>
    </div>
  );
}

export default ContactForm;
