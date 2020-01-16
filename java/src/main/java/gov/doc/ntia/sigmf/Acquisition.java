package gov.doc.ntia.sigmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gov.doc.ntia.sigmf.ext.global.scos.Action;
import gov.doc.ntia.sigmf.ext.global.scos.ScheduleEntry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class Acquisition implements Serializable {


    private static final long serialVersionUID = 1L;

    @JsonProperty
    protected MetaDoc metaDoc;

    @JsonProperty
    protected transient ByteBuffer data;

    public Acquisition(){}


    public MetaDoc getMetaDoc() {
        return metaDoc;
    }

    public void setMetaDoc(MetaDoc metaDoc) {
        this.metaDoc = metaDoc;
    }

    public ByteBuffer getData() {
        return data;
    }

    public void setData(ByteBuffer data) {
        this.data = data;
    }


    @Override
    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        String message=null;
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }


    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(metaDoc);
        oos.writeObject(this.data.array());
    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        metaDoc = (MetaDoc) ois.readObject();
        byte[] bytes = (byte[])ois.readObject();
        data = ByteBuffer.wrap(bytes);
    }

    public String getName(){
        String name = getMetaDoc().getGlobal().getSensor().getId() + "_" +
                getScheduleId()+ "_" +
                getTaskId();

        return name;
    }

    public String getActionName(){
        Action action = metaDoc.getGlobal().getAction();
        if(action == null || action.getName() == null){
            return "unknown";
        }
        else{
            return action.getName();
        }
    }


    private String getScheduleId(){
        ScheduleEntry scheduleEntry = metaDoc.getGlobal().getSchedule();
        String missingScheduleInfo = "unknown";
        if(scheduleEntry == null){
            return  missingScheduleInfo;
        }
        else if(scheduleEntry.getId() == null){
            return missingScheduleInfo;
        }
        else{
            return scheduleEntry.getId();
        }
    }

    private  String getTaskId(){
        String taskId = metaDoc.getGlobal().getTaskId().toString();
        if(taskId == null){
            taskId = "unknown";
        }
        return taskId;
    }

}