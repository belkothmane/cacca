import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/prova")
@Api(value = "/prova")
public class Prova{
	
	@RequestMapping(path = "/fai", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	  @ApiOperation(value = "webservice di prova", response = ProvaResponse.class)
	  public ResponseEntity<ProvaResponse> getListCapienza() {
		
		ResponseEntity<ProvaResponse> returnResponseEntity = null;
		ProvaResponse response = new ProvaResponse();
		response.setEsito("OK");
		
		
		 returnResponseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		 
		 return returnResponseEntity;
		
	}
	
}