import React from "react";
import OwlCarousel from "react-owl-carousel";
import "owl.carousel/dist/assets/owl.carousel.css";
import "owl.carousel/dist/assets/owl.theme.default.css";
import { images } from "../helpers/CarouselData";

function OwlCarouselComponent() {
  return (
    <OwlCarousel className="owl-theme" items={1} loop margin={10}>
      {images.map((image) => (
        <div className="item">
          <img src={image.img} alt="obiectiv" />
        </div>
      ))}
    </OwlCarousel>
  );
}

export default OwlCarouselComponent;
