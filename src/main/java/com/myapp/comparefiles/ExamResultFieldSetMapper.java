package com.myapp.comparefiles;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
 
import com.myapp.comparefiles.domain.ExamResult;
 
public class ExamResultFieldSetMapper implements FieldSetMapper<ExamResult>{
 
    @Override
    public ExamResult mapFieldSet(FieldSet fieldSet) throws BindException {
        ExamResult result = new ExamResult();
        result.setColumn1(fieldSet.readLong(0));
        result.setColumn2(fieldSet.readString(1));
        result.setColumn3(fieldSet.readInt(2));
        return result;
    }
 
}
