import "./DummyObjectivePage.css";
import Navbar from "../components/Navbar";
import OwlCarouselComponent from "../components/OwlCarouselComponent";
import StarRating from "../components/StarRating";

function DummyObjectivePage(props) {
  const landmark = props.location.state;

  return (
    <div>
      <section className="section-blue" style={{ paddingBottom: "0px" }}>
        <Navbar />
        <div className="row" style={{ height: "calc(100vh - 100px)" }}>
          <div className="col-10 col-md-6 owl-carousel-container">
            <OwlCarouselComponent />
          </div>
          <div
            className="col-10 col-md-6 span-container"
            style={{ height: "100%" }}
          >
            <section id="objective-details" className="span-section">
              <div>
                <h1>{landmark.nameLandmark}</h1>
                  <h4>General Description</h4>
                  <p>{landmark.generalDescriptionTextLandmark}</p>
              </div>
              <div>
                <button
                  onClick={() =>
                    document
                      .getElementById("team-reviews")
                      .scrollIntoView({ behavior: "smooth" })
                  }
                  className="red-button"
                >
                  Vezi parerea echipei
                </button>
              </div>
            </section>
            <section id="team-reviews" className="span-section">
              <div>
                <h1>{landmark.nameLandmark}</h1>
                <h4>Accessibility</h4>
                <p>{landmark.accessibilityRatingTextLandmark}</p>
                <StarRating rating = {landmark.starRatingAcessibilityLandmark} />
              </div>
              <div>
                <button
                  onClick={() =>
                    document
                      .getElementById("users-reviews")
                      .scrollIntoView({ behavior: "smooth" })
                  }
                  className="red-button"
                >
                  Vezi parerea altor turisti
                </button>
              </div>
            </section>
            <section id="users-reviews" className="span-section">
              <div>
                <h1>{landmark.nameLandmark}</h1>
                <h4>Quality</h4>
                <p>{landmark.qualityRatingTextLandmark}</p>
                <StarRating rating = {landmark.starRatingQualityLandmark} />
                <h4>Trust</h4>
                <p>{landmark.trustRatingTextLandmark}</p>
                <StarRating rating = {landmark.starRatingTrustLandmark} />
                <h4>Popularity</h4>
                <p>{landmark.popularityRatingTextLandmark}</p>
                <StarRating rating = {landmark.starRatingPopularityLandmark} />
              </div>
              <div>
                <button className="red-button">CTA</button>
              </div>
            </section>
          </div>
        </div>
      </section>
    </div>
  );
}

export default DummyObjectivePage;
