package com.goseero.goseero_spring_boot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "landmarks")
public class Landmark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long idLandmark;

    @Column(name = "name", nullable = false, length = 50)
    private String nameLandmark;

    @Column(name = "general_description_text", nullable = false, length = 300)
    private String generalDescriptionTextLandmark;

    @Column(name = "accessibility_text", nullable = false, length = 300)
    private String accessibilityRatingTextLandmark;

    @Column(name = "quality_text", nullable = false, length = 300)
    private String qualityRatingTextLandmark;

    @Column(name = "trust_text", nullable = false, length = 300)
    private String trustRatingTextLandmark;

    @Column(name = "popularity_text", nullable = false, length = 300)
    private String popularityRatingTextLandmark;

    @Column(name = "accessibility_star", nullable = false)
    private Float starRatingAcessibilityLandmark;

    @Column(name = "quality_star", nullable = false)
    private Float starRatingQualityLandmark;

    @Column(name = "trust_star", nullable = false)
    private Float starRatingTrustLandmark;

    @Column(name = "popularity_star", nullable = false)
    private Float starRatingPopularityLandmark;

    @Column(name = "latitude", nullable = false)
    private Float latitudeLandmark;

    @Column(name = "longitude", nullable = false)
    private Float longitudeLandmark;

    // Constructors
    public Landmark() {
    }

    public Landmark(String nameLandmark, String generalDescriptionTextLandmark, String accessibilityRatingTextLandmark, String qualityRatingTextLandmark, String trustRatingTextLandmark, String popularityRatingTextLandmark, Float starRatingAcessibilityLandmark, Float starRatingQualityLandmark, Float starRatingTrustLandmark, Float starRatingPopularityLandmark, Float latitudeLandmark, Float longitudeLandmark) {
        this.nameLandmark = nameLandmark;
        this.generalDescriptionTextLandmark = generalDescriptionTextLandmark;
        this.accessibilityRatingTextLandmark = accessibilityRatingTextLandmark;
        this.qualityRatingTextLandmark = qualityRatingTextLandmark;
        this.trustRatingTextLandmark = trustRatingTextLandmark;
        this.popularityRatingTextLandmark = popularityRatingTextLandmark;
        this.starRatingAcessibilityLandmark = starRatingAcessibilityLandmark;
        this.starRatingQualityLandmark = starRatingQualityLandmark;
        this.starRatingTrustLandmark = starRatingTrustLandmark;
        this.starRatingPopularityLandmark = starRatingPopularityLandmark;
        this.latitudeLandmark = latitudeLandmark;
        this.longitudeLandmark = longitudeLandmark;
    }
//CREATE TABLE landmarks(id BIGINT, name VARCHAR(50), general_description_text VARCHAR(500), accessibility_text VARCHAR(500), quality_text VARCHAR(500), trust_text VARCHAR(500), popularity_text VARCHAR(500), accessibility_star SMALLINT, quality_star SMALLINT, trust_star SMALLINT, popularity_star SMALLINT, latitude FLOAT, longitude FLOAT
    // Getters
    public Long getIdLandmark() {
        return idLandmark;
    }

    public String getNameLandmark() {
        return nameLandmark;
    }

    public String getGeneralDescriptionTextLandmark() {
        return generalDescriptionTextLandmark;
    }

    public String getAccessibilityRatingTextLandmark() {
        return accessibilityRatingTextLandmark;
    }

    public String getQualityRatingTextLandmark() {
        return qualityRatingTextLandmark;
    }

    public String getTrustRatingTextLandmark() {
        return trustRatingTextLandmark;
    }

    public String getPopularityRatingTextLandmark() {
        return popularityRatingTextLandmark;
    }

    public Float getStarRatingAcessibilityLandmark() {
        return starRatingAcessibilityLandmark;
    }

    public Float getStarRatingQualityLandmark() {
        return starRatingQualityLandmark;
    }

    public Float getStarRatingTrustLandmark() {
        return starRatingTrustLandmark;
    }

    public Float getStarRatingPopularityLandmark() {
        return starRatingPopularityLandmark;
    }

    public Float getLatitudeLandmark() {
        return latitudeLandmark;
    }

    public Float getLongitudeLandmark() {
        return longitudeLandmark;
    }

    //Setters

    public void setIdLandmark(Long idLandmark) {
        this.idLandmark = idLandmark;
    }

    public void setNameLandmark(String nameLandmark) {
        this.nameLandmark = nameLandmark;
    }

    public void setGeneralDescriptionTextLandmark(String generalDescriptionTextLandmark) {
        this.generalDescriptionTextLandmark = generalDescriptionTextLandmark;
    }

    public void setAccessibilityRatingTextLandmark(String accessibilityRatingTextLandmark) {
        this.accessibilityRatingTextLandmark = accessibilityRatingTextLandmark;
    }

    public void setQualityRatingTextLandmark(String qualityRatingTextLandmark) {
        this.qualityRatingTextLandmark = qualityRatingTextLandmark;
    }

    public void setTrustRatingTextLandmark(String trustRatingTextLandmark) {
        this.trustRatingTextLandmark = trustRatingTextLandmark;
    }

    public void setPopularityRatingTextLandmark(String popularityRatingTextLandmark) {
        this.popularityRatingTextLandmark = popularityRatingTextLandmark;
    }

    public void setStarRatingAcessibilityLandmark(Float starRatingAcessibilityLandmark) {
        this.starRatingAcessibilityLandmark = starRatingAcessibilityLandmark;
    }

    public void setStarRatingQualityLandmark(Float starRatingQualityLandmark) {
        this.starRatingQualityLandmark = starRatingQualityLandmark;
    }

    public void setStarRatingTrustLandmark(Float starRatingTrustLandmark) {
        this.starRatingTrustLandmark = starRatingTrustLandmark;
    }

    public void setStarRatingPopularityLandmark(Float starRatingPopularityLandmark) {
        this.starRatingPopularityLandmark = starRatingPopularityLandmark;
    }

    public void setLatitudeLandmark(Float latitudeLandmark) {
        this.latitudeLandmark = latitudeLandmark;
    }

    public void setLongitudeLandmark(Float longitudeLandmark) {
        this.longitudeLandmark = longitudeLandmark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Landmark)) return false;
        Landmark landmark = (Landmark) o;
        return Float.compare(landmark.starRatingAcessibilityLandmark, starRatingAcessibilityLandmark) == 0 && Float.compare(landmark.starRatingQualityLandmark, starRatingQualityLandmark) == 0 && Float.compare(landmark.starRatingTrustLandmark, starRatingTrustLandmark) == 0 && Float.compare(landmark.starRatingPopularityLandmark, starRatingPopularityLandmark) == 0 && Float.compare(landmark.latitudeLandmark, latitudeLandmark) == 0 && Float.compare(landmark.longitudeLandmark, longitudeLandmark) == 0 && Objects.equals(idLandmark, landmark.idLandmark) && Objects.equals(nameLandmark, landmark.nameLandmark) && Objects.equals(generalDescriptionTextLandmark, landmark.generalDescriptionTextLandmark) && Objects.equals(accessibilityRatingTextLandmark, landmark.accessibilityRatingTextLandmark) && Objects.equals(qualityRatingTextLandmark, landmark.qualityRatingTextLandmark) && Objects.equals(trustRatingTextLandmark, landmark.trustRatingTextLandmark) && Objects.equals(popularityRatingTextLandmark, landmark.popularityRatingTextLandmark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLandmark, nameLandmark, generalDescriptionTextLandmark, accessibilityRatingTextLandmark, qualityRatingTextLandmark, trustRatingTextLandmark, popularityRatingTextLandmark, starRatingAcessibilityLandmark, starRatingQualityLandmark, starRatingTrustLandmark, starRatingPopularityLandmark, latitudeLandmark, longitudeLandmark);
    }
}
