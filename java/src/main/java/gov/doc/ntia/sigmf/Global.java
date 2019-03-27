package gov.doc.ntia.sigmf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import gov.doc.ntia.sigmf.ext.global.Action;
import gov.doc.ntia.sigmf.ext.global.Emitter;
import gov.doc.ntia.sigmf.ext.global.Schedule;
import gov.doc.ntia.sigmf.ext.global.Sensor;

@JsonInclude(Include.NON_NULL)
public class Global {


    //string	The format of the stored samples in the dataset file.
    //Its value must be a valid SigMF dataset format type string.
    @JsonProperty(value="core:datatype", required = true)
    protected String datatype;


    //The sample rate of the signal in samples per second.
    @JsonProperty(value="core:sample_rate", required = false)
    protected Double sampleRate;

    //The version of the SigMF specification used to create the metadata file.
    @JsonProperty(value="core:version", required = true)
    protected String version;


    //The SHA512 hash of the dataset file associated with the SigMF file.
    @JsonProperty(value="core:sha512", required = false)
    protected String sha512;

    //The index number of the first sample in the dataset.
    //This value defaults to zero. Typically used when a recording is split over multiple files.
    @JsonProperty(value="core:offset", required = false)
    protected Long offset;

    //A text description of the SigMF recording.
    @JsonProperty(value="core:description", required = false)
    protected String description;

    //The author's name (and optionally e-mail address).
    @JsonProperty(value="core:author", required = false)
    protected String author;

    //The registered DOI (ISO 26324) for a recording's metadata file.
    @JsonProperty(value="core:meta_doi", required = false)
    protected String metaDoi;

    //The registered DOI (ISO 26324) for a recording's dataset file.
    @JsonProperty(value="core:data_doi", required = false)
    protected String dataDoi;

    //The name of the software used to make this SigMF recording.
    @JsonProperty(value="core:recorder", required = false)
    protected String recorder;

    //A URL for the license document under which the recording is offered;
    // when possible, use the canonical document provided by the license author,
    // or, failing that, a well-known one.
    @JsonProperty(value="core:license", required = false)
    protected String license;

    //A text description of the hardware used to make the recording.
    @JsonProperty(value="core:hw", required = false)
    protected String hw;


    @JsonProperty(value="core:extensions", required = false)
    protected Extensions extensions;


    @JsonProperty(value="ntia-sensor:sensor", required = false)
    protected Sensor sensor;

    @JsonProperty(value="ntia-emitter:emitter", required = false)
    protected Emitter emitter;

    @JsonProperty(value="ntia-scos:action", required = false)
    protected Action action;

    @JsonProperty(value="ntia-scos:schedule", required = false)
    protected Schedule schedule;

    @JsonProperty(value="ntia-scos:task_id", required = false)
    protected Long taskId;

    public String getSha512() {
        return sha512;
    }

    public void setSha512(String sha512) {
        this.sha512 = sha512;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMetaDoi() {
        return metaDoi;
    }

    public void setMetaDoi(String metaDoi) {
        this.metaDoi = metaDoi;
    }

    public String getDataDoi() {
        return dataDoi;
    }

    public void setDataDoi(String dataDoi) {
        this.dataDoi = dataDoi;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getHw() {
        return hw;
    }

    public void setHw(String hw) {
        this.hw = hw;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }


    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public Double getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Emitter getEmitter() {
        return emitter;
    }

    public void setEmitter(Emitter emitter) {
        this.emitter = emitter;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }


}