package br.com.db.sistema.votacao.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.db.sistema.votacao.v1.service.VoteService;

@RequestMapping("v1/vote")
@RestController
public class VoteController
{
    public VoteService voteService;


    
}