package br.com.db.sistema.votacao.config.swaggers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.db.sistema.votacao.v1.model.dto.AgendaDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

public interface AgendaSwagger
{
    @Operation(operationId = "Cadastra nova Agenda",
                summary = "Cadastra um nova Agenda",
                tags = {"Agenda"},
                responses = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "Operação bem Sucedida",
                                content = @Content(
                                        schema = @Schema(implementation = AgendaDTO.class),
                                        mediaType = MediaType.APPLICATION_JSON_VALUE
                                )
                        ),
                        @ApiResponse(
                                responseCode = "400", 
                        description = "Erro ao criar a agenda")
                }
    )
    @PostMapping
    ResponseEntity<String> createAgenda( @Valid @RequestBody AgendaDTO agendaDTO );


    @Operation(operationId = "Buscar uma agenda pelo ID",
    summary = "Retorna uma agenda com base no ID fornecido",
    tags = {"Agenda"},
    responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Operação bem Sucedida",
                        content = @Content(
                                schema = @Schema( implementation = AgendaDTO.class ),
                                mediaType = MediaType.APPLICATION_JSON_VALUE
                                )
                ),
                @ApiResponse(
                        responseCode = "400", 
                        description = "Erro ao buscar a agenda",
                        content = @Content( 
                                schema = @Schema( implementation = Error.class ),
                                mediaType = MediaType.APPLICATION_JSON_VALUE
                        )
                )
    })
    @GetMapping("/{id}")
    ResponseEntity<AgendaDTO> getAgendaById(@PathVariable Long id);

    @Operation(operationId = "Buscar todas as agendas",
        summary = "Retorna todas as agendas",
        tags = {"Agenda"},
        responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Operação bem Sucedida",
                        content = @Content(
                                schema = @Schema(implementation = AgendaDTO.class),
                                mediaType = MediaType.APPLICATION_JSON_VALUE
                        )
                )
        }
    )
    @GetMapping
    ResponseEntity<List<AgendaDTO>> getAllAgendas();
}