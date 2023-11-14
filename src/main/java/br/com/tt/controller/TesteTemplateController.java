package br.com.tt.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tt.dto.TesteTemplateDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class TesteTemplateController {

	@GetMapping("/")
	public ResponseEntity<TesteTemplateDTO> index() throws IOException {

		TesteTemplateDTO oTesteTemplateDTO = new TesteTemplateDTO();
		oTesteTemplateDTO.setData("Hello Word");
		return ResponseEntity.ok(oTesteTemplateDTO);
	}

}