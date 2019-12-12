package gov.doc.ntia.sigmf.ext.global.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Spheroid {

    @JsonProperty(value = "id", required = false)
    protected String id;

    @JsonProperty(value = "description", required = false)
    protected  String description;

    @JsonProperty(value = "semiminor", required = false)
    protected Double semiminor;

    @JsonProperty(value = "semimajor", required = false)
    protected Double semimajor;

    @JsonProperty(value = "flattening", required = false)
    protected Double flattening;

    @JsonProperty(value = "angular_unit", required = false)
    protected String angularUnit;

    @JsonProperty(value="prime_meridian", required = false)
    protected String primeMeridian;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSemiminor() {
        return semiminor;
    }

    public void setSemiminor(Double semiminor) {
        this.semiminor = semiminor;
    }

    public Double getSemimajor() {
        return semimajor;
    }

    public void setSemimajor(Double semimajor) {
        this.semimajor = semimajor;
    }

    public Double getFlattening() {
        return flattening;
    }

    public void setFlattening(Double flattening) {
        this.flattening = flattening;
    }

    public String getAngularUnit() {
        return angularUnit;
    }

    public void setAngularUnit(String angularUnit) {
        this.angularUnit = angularUnit;
    }

    public String getPrimeMeridian() {
        return primeMeridian;
    }

    public void setPrimeMeridian(String primeMeridian) {
        this.primeMeridian = primeMeridian;
    }





}
