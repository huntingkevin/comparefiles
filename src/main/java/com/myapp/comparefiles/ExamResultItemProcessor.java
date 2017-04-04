package com.myapp.comparefiles;

import org.springframework.batch.item.ItemProcessor;

import com.myapp.comparefiles.domain.ExamResult;
 
public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult>{
 
    @Override
    public ExamResult process(ExamResult result) throws Exception {
        System.out.println("Processing result :"+result);
 
        /*
         * Only return results which are equal or more than 60%
         *
         */
        if(result.getColumn3() < 60){
            return null;
        }
 
        return result;
    }
 
}
