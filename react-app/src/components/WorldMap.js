import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import { Link } from "react-router-dom";
import "./WorldMap.css"

function WorldMap(props) {
    return (
        <MapContainer center={[45.996339, 24.853905]} zoom={7} scrollWheelZoom={false}>
            <TileLayer
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png" />
            {props.pins.map(lm => <Marker key={lm.idLandmark} position={[lm.latitudeLandmark, lm.longitudeLandmark]}>
                <Popup>
                    <div>
                        <p>{lm.nameLandmark}</p>
                    </div>
                    <Link className="link" to={{
                        pathname: "/dummy_objective",
                        state: lm
                    }} >Take me there</Link>
                </Popup>
            </Marker>)}
        </MapContainer>
    );
}

export default WorldMap;