package br.com.fiap;

import br.com.fiap.model.Treino;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle-fiap");

        EntityManager manager = factory.createEntityManager();

        // save(manager);
        // findById(manager);
        // findAll(manager);

    }

    private static void findAll(EntityManager manager) {
        String jpql = "FROM Processo";

        List<Processo> resultlist = manager.createQuery(jpql).getResultList();

        resultlist.stream().forEach(System.out::println);
    }

    private static void findById(EntityManager manager) {
        Processo processo = manager.find(Processo.class, 1L);

        System.out.println(processo);
    }

    private static void save(EntityManager manager) {
        Treino tr = new Treino();
        tr.setNome("São Paulo").setDescricao("subir, descer").setPreparador(pr).setInicio(LocalDateTime.MIN).setFim(LocalDateTime.now()).setFundamento(fd).setA

        TipoDeAcao tpAcao = new TipoDeAcao();
        tpAcao.setNome("Ação de Alimentos");

        Advogado adv = new Advogado();
        adv.setEstado(uf).setNome("Benefrancis do Nascimento").setNumeroOAB("123456");

        Processo alimentos = new Processo();
        alimentos.setAdvogado(adv).setTipoDeAcao(tpAcao).setNumero("12345678910").setProBono(true).setDataDeDistribuicao(LocalDate.now());

        manager.getTransaction().begin();
        manager.persist(tr);
        manager.persist(tpAcao);
        manager.persist(adv);
        manager.persist(alimentos);
        manager.getTransaction().commit();
    }
}