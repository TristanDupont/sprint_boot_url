package sample.controller;

import org.bytedeco.javacpp.presets.openblas_nolapack;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tristan Dupont
 */
@RestController
public class SimpleController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> healthCheck() {
        openblas_nolapack.blas_set_num_threads(2);

        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
