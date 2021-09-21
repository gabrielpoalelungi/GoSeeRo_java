import React from "react";
import "./AboutPage.css";
import Navbar from "../components/Navbar";
import ProfileCard from "../components/ProfileCard";
import ContactForm from "../components/ContactForm";

function AboutPage() {
  return (
    <div>
      <section className="section-blue container-relative">
        {/* <img className="ellipse" src="./images/Ellipse 1.png" alt="elipse"/> */}
        <div className="container-fluid mx-auto">
          <Navbar />
          <div className="row mt-5 mx-auto flex-y-center">
            <div className="col-10 col-md-6 hero-section-content">
              <h1>Despre noi</h1>
              <div className="blue-line"></div>
              <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting
                industry. Lorem Ipsum has been the industry's standard dummy
                text ever since the 1500s, when an unknown printer took a galley
                of type and scrambled it to make a type specimen book. It has
                survived not only five centuries, but also the leap into
                electronic typesetting, remaining essentially unchanged. It was
                popularised in the 1960s with the release of Letraset sheets
                containing Lorem Ipsum passages, and more recently with desktop
                publishing software like Aldus PageMaker including versions of
                Lorem Ipsum.
              </p>
              <button className="red-button">Join Team</button>
            </div>
            <div className="col-10 col-md-6 flex-end hero-section-image-container">
              <img src="./images/tourist-big 1.png" />
            </div>
          </div>
        </div>
      </section>

      <section className="section-light-blue container-relative">
        <div>
          <div className="my-5">
            <h6 className="section-subtitle">Subtitle</h6>
            <h3 className="section-title">Cine suntem?</h3>
          </div>
          <div className="container-fluid about-content-section">
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem
              adipiscing neque enim nunc sit fermentum. Mauris, sed risus,
              viverra dapibus. Ut in nulla morbi felis, eleifend mauris. Id a
              nulla sed lorem. Vestibulum proin id suspendisse gravida. Mauris
              diam at consectetur nisl tempor. Massa tristique suspendisse
              parturient dictum in mauris eros volutpat nulla. Elit pellentesque
              risus maecenas mi integer tempor nibh et, posuere. Etiam lacinia
              donec enim feugiat sed ac. Eget sem nec sodales quam erat sem
              lacus. Nibh lobortis rhoncus cras leo lectus ut consequat. Sed
              mattis nunc pellentesque quam egestas blandit dignissim. Nulla
              cursus imperdiet nisl sollicitudin. Enim sodales sed libero purus
              elit, donec ac. Amet nunc enim tincidunt tristique. Platea lacinia
              vel habitasse morbi maecenas. Adipiscing magna nulla sed diam
              orci. Sed gravida tellus pretium diam. Pretium ornare gravida
              faucibus in iaculis lorem sed euismod sit. Sed ultricies blandit
              aliquam, euismod in habitant nunc. Quis quis feugiat ornare
              iaculis nunc senectus. Lobortis adipiscing aliquam phasellus
              dignissim eget a aenean eleifend ut. Auctor dui varius nisl
              egestas aenean vitae ultrices. Vivamus odio donec tortor mi orci,
              morbi. Sit condimentum tortor, eleifend in ut accumsan vel amet.
              Ornare tincidunt consequat malesuada natoque. Viverra a volutpat
              suspendisse vulputate dictum dignissim. Auctor sodales ut sed
              egestas a. Pulvinar tincidunt volutpat mollis amet.
            </p>
          </div>
        </div>
      </section>

      <section className="section-pink container-relative">
        <div classNmae="container-fluid">
          <div className="my-5">
            <h6 className="section-subtitle">Subtitle</h6>
            <h3 className="section-title">Descopera echipa</h3>
          </div>
          <div className="container-fluid">
            <div className="row my-5 mx-auto">
              <ProfileCard />
              <ProfileCard />
              <ProfileCard />
              <ProfileCard />
              <ProfileCard />
              <ProfileCard />
            </div>
          </div>
        </div>
      </section>

      <section className="section-lught-blue container-relative">
        <div classNmae="container-fluid">
          <div className="my-5">
            <h6 className="section-subtitle">Subtitle</h6>
            <h3 className="section-title">Alatura-te echipei</h3>
          </div>
          <div>
            <ContactForm />
          </div>
        </div>
      </section>
    </div>
  );
}

export default AboutPage;
