import "./HomePage.css";
import Navbar from "../components/Navbar";
import FlipCard from "../components/FlipCard";
import WorldMap from "../components/WorldMap";
import api from '../api/landmarks';
import { useEffect, useState } from "react";

function HomePage() {
  const [landmarks, setLandmarks] = useState([]);

  useEffect(() => {
    const fetchLandmarks = async () => {
      try {
        const response = await api.get('/');
        setLandmarks(response.data);

      } catch (err) {
        if (err.response) {
          console.log(err.response.data);
        }
        else {
          console.log(`Err: ${err.message}`);
        }
      }
    }

    fetchLandmarks();
  }, [])

  return (
    <div>
      <section className="section-blue container-relative">
        {/* <img className="ellipse" src="./images/Ellipse 1.png" alt="elipse"/> */}
        <div className="container-fluid mx-auto">
          <Navbar />
          <div className="row mt-5 mx-auto flex-y-center">
            <div className="col-10 col-md-6 hero-section-content">
              <h1>Headline</h1>
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
              <button className="red-button">Call to action</button>
            </div>
            <div className="col-10 col-md-6 flex-end hero-section-image-container">
              <img src="./images/tourist.png" />
            </div>
          </div>
        </div>
      </section>

      <section className="section-light-blue">
        <div className="my-5">
          <h6 className="section-subtitle">Subtitle</h6>
          <h3 className="section-title">Second Title</h3>
        </div>
        <div className="container-fluid flip-card-container">
          <div className="row mx-auto">
            <div className="col-4">
              <FlipCard />
            </div>
            <div className="col-4">
              <FlipCard />
            </div>
            <div className="col-4">
              <FlipCard />
            </div>
          </div>
        </div>
      </section>

      <section className="section-pink flex-y-center">
        <div className="container-fluid mx-auto">
          <div className="row mx-auto flex-y-center">
            <div className="col-10 col-md-6 section-content">
              <h1>Headline</h1>
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
            </div>
            <div className="col-10 col-md-6 flex-end">
              <img src="./images/animation_! 1.png" />
            </div>
          </div>
        </div>
      </section>

      <section className="section-blue flex-y-center">
        <div className="container-fluid mx-auto">
          <div className="row mx-auto flex-y-center">
            <div className="col-10 col-md-6 flex-start">
              <img src="./images/animation_2 1.png" />
            </div>
            <div className="col-10 col-md-6 section-content">
              <h1>Headline</h1>
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
            </div>
          </div>
        </div>
      </section>

      <section className="section-light-blue">
        <div className="my-5">
          <h6 className="section-subtitle">Subtitle</h6>
          <h3 className="section-title">Second Title</h3>
        </div>
        <div className="container-fluid flex-x-center">
          <WorldMap pins={landmarks} />
        </div>
      </section>
    </div>
  );
}

export default HomePage;
