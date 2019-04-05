package spoon.test.processing.processors;

import org.apache.log4j.Level;
import spoon.processing.AbstractAnnotationProcessor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtTypeReference;
import spoon.test.processing.testclasses.MyCatchAnnotation;

public class CatchAnnotationProcessor extends AbstractAnnotationProcessor<MyCatchAnnotation, CtTypeReference> {
    public boolean successfullyDetected = false;

    @Override
    public void process(MyCatchAnnotation annotation, CtTypeReference element) {
        CtMethod<?> method = element.getParent(CtMethod.class);
        getFactory().getEnvironment().report(this, Level.ALL, method, "in the CatchAnnotationProcessor");
        this.successfullyDetected = true;
    }
}