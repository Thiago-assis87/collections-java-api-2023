package map.OperacoesBasicas.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate,Evento>eventoMap;

    public AgendaEventos(){this.eventoMap =new HashMap<>(); }

    public void adicionarEventos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,evento);
    }

    public void exbirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obteProximoEvento(){
       // Set<LocalDate> dateSet = eventoMap.keySet();
        //Collection<Evento>values = eventoMap.values();
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();
                System.out.println("O proximo evento:" +entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento 1" , "Atracao 1");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 9), "Evento 2" , "Atracao2");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.SEPTEMBER, 16), "Evento 4", "Atracao 4");

        agendaEventos.exbirAgenda();

        agendaEventos.obteProximoEvento();
    }
}
