package it.prova.prova.filesProva;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/prova")
@Api(value = "/prova")
public class Prova{
	
	 @RequestMapping(path = "/fai", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	  @ApiOperation(value = "WEBSERVICE PROVA", response = ProvaResponse.class)
	  public ResponseEntity<ProvaResponse> prova() {
		
		ResponseEntity<ProvaResponse> returnResponseEntity = null;
		ProvaResponse response = new ProvaResponse();
		response.setEsito("OK");
		
		
		 returnResponseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		 
		 return returnResponseEntity;
		
	}
	
}