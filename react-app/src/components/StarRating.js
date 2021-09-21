import React from "react"
import { FaStar } from "react-icons/fa";

const colors = {
    orange: "#FFBA5A",
    grey: "#A9A9A9"
}

const styles = {

}

function StarRating (props) {
    const stars = Array(5).fill(0);

    return(
    <div style = {styles.stars}>
        {stars.map((_ , index) => {
            return (
                <FaStar
                    key = {index} 
                    size = {24}
                    style = {{
                        marginRight: 10
                    }}
                    color = {props.rating > index ? colors.orange : colors.grey}
                    />
            )
        })}
    </div>);
}

export default StarRating;