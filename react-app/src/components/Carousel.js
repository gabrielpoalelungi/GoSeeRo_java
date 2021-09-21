import React, { useState } from "react";
import "./Carousel.css";
import { images } from "../helpers/CarouselData";
import ArrowBackIosIcon from "@material-ui/icons/ArrowBackIos";
import ArrowForwardIosIcon from "@material-ui/icons/ArrowForwardIos";

function Carousel() {
  const [currImg, setCurrImg] = useState(0);

  return (
    <div className="carousel">
      <div
        className="carousel-inner"
        style={{ backgroundImage: `url(${images[currImg].img})` }}
      >
        <div
          className="left"
          onClick={() => {
            currImg === 0
              ? setCurrImg(images.length - 1)
              : setCurrImg(currImg - 1);
          }}
        >
          <ArrowBackIosIcon />
        </div>
        <div className="center"></div>
        <div
          className="right"
          onClick={() => {
            currImg === images.length - 1
              ? setCurrImg(0)
              : setCurrImg(currImg + 1);
          }}
        >
          <ArrowForwardIosIcon />
        </div>
      </div>
    </div>
  );
}

export default Carousel;
