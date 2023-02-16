package .models.operations;

import .utils.SpeakeasyMetadata;

public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
    public RegisterSchemaRequestBody withFile(RegisterSchemaRequestBodyFile file) {
        this.file = file;
        return this;
    }
    
}
