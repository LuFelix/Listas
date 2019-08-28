package daoListas;

import java.sql.SQLException;
import java.util.List;

import beansListas.CheckList;
import beansListas.Grupo;
import beansListas.ItemCheckList;

public abstract class InterDAOListas {

	/**
	 * TODO Acesso a dados de Grupos
	 */

	/**
	 * Grupos - Cria um novo grupo
	 * 
	 * @author Luciano Felix
	 * 
	 * @param nomeGrupo
	 */
	public abstract boolean addGrupo(String nomeGrupo);

	/**
	 * Grupos - Retorna um grupo atrav�s do nome
	 * 
	 * @author Luciano Felix
	 * 
	 * @param nomeGrupo
	 * @return
	 */
	public abstract Grupo buscaGrupo(String nomeGrupo);

	/**
	 * Grupos - Retorna um grupo atrav�s da sequencia
	 * 
	 * @author Luciano Felix
	 * 
	 * @param seqGrupo
	 * @return
	 */
	public abstract Grupo buscaGrupo(int seqGrupo);

	/**
	 * Grupos - Retorna array contendo os grupos existentes sem as listas
	 * 
	 * @author Luciano Felix
	 * 
	 * @return List <CheckList>
	 */
	public abstract List<Grupo> lerGrupos();

	/**
	 * Grupos - Atualiza o grupo recebido por par�metro
	 * 
	 * @param Grupo
	 *            -- g grupo a ser atualizado
	 */
	public abstract void atualizaGrupo(Grupo g);

	/**
	 * Grupos - Remove o grupo recebido por par�metro
	 * 
	 * @param nomeGrupo
	 */
	public abstract void remGrupo(Grupo grupo);

	/**
	 * TODO Acesso a dados de Listas no MDB
	 */

	/**
	 * Listas - Cria uma nova lista
	 * 
	 * @author Luciano Felix
	 * 
	 * @param CheckList
	 *            checkList - Lista a ser criada
	 */
	public abstract void addLista(CheckList chkList);

	/**
	 * Listas - Retorna um array contendo as listas sem os �tens.
	 * 
	 * @author Luciano Felix
	 * 
	 * @return List <CheckList>
	 */
	public abstract List<CheckList> lerListas();

	/**
	 * Listas - Retorna um array com listas sem os �tens por grupo.
	 * 
	 * @author Luciano Felix
	 * 
	 * @param int
	 *            -- seq_grupo sequencia do Grupo
	 * @return List <CheckList>
	 */
	public abstract List<CheckList> lerListas(int grupo);

	/**
	 * Listas - Retorna a lista recebida carregada com os �tens
	 * 
	 * @author Luciano Felix
	 * 
	 * @param CheckList
	 *            -- Lista para carregar os �tens
	 * 
	 * @return CheckList -- checkList com a lisa de �tens
	 */
	public abstract CheckList carregarItens(CheckList checkList);

	/**
	 * Listas - Atualiza uma lista previamente alterada
	 * 
	 * @author Luciano Felix
	 * 
	 * @param CheckList
	 *            -- Lista a ser modificada
	 */
	public abstract void atualizaLista(CheckList checkList);

	/**
	 * Listas - Atualiza a lista com os dados
	 * 
	 * @param CheckList
	 *            --checkList com a ser modificada
	 */
	public abstract void alteraGrupoLista(CheckList checkList);

	/**
	 * Remove uma lista da tabela
	 * 
	 * @param CheckList
	 *            -- checkList a ser removida
	 */
	public abstract boolean remLista(CheckList chkList);

	/**
	 * TODO Acesso a dados de �tens no MDB
	 */

	/**
	 * �tens - Adiciona um �tem na lista recebendo o �tem e a lista
	 * 
	 * @author Luciano Felix
	 * 
	 * @param chkList
	 * @param item
	 */
	public abstract void addItemListaSeqLista(CheckList chkList,
			ItemCheckList item);

	/**
	 * �tens - Atualiza o �tem recebido por par�metro
	 * 
	 * @author Luciano Felix
	 * 
	 * @param item
	 */
	public abstract void atualizaItem(ItemCheckList item);

	/**
	 * �tens - Retorna uma array com os �tens por nomeLista
	 * 
	 * @author Luciano Felix
	 * 
	 * @param String
	 *            -- nomeLista - o nome da lista para carregar os �tens
	 * 
	 * @return ArrayList<ItemCheckList>
	 */
	public abstract List<ItemCheckList> lerItensListaNomeLista(
			String nomeLista);

	/**
	 * �tens - Retorna um array com os �tens por seqLista
	 * 
	 * @author Luciano Felix
	 * 
	 * @param numLista
	 * 
	 * @return List
	 */
	public abstract List<ItemCheckList> lerItensListaSeq(int numLista);

	/**
	 * �tens - Retorna um array com os �tens por seqLista e status
	 * 
	 * @author Luciano Felix
	 * 
	 * @param numLista
	 *            -- N�mero de sequencia da lista a exibir
	 * @param status
	 *            -- Se est� conclui�do o �tem
	 * 
	 * @return List
	 */
	public abstract List<ItemCheckList> lerItensListaSeq(int numLista,
			boolean status);

	/**
	 * �tens - Remove o �tem recebido atrav�s do par�metro
	 * 
	 * @author Luciano Felix
	 * 
	 * @param CheckList
	 *            -- chkList a ser removido
	 * @param ItemCheckList
	 *            -- item
	 */
	public abstract void remItem(ItemCheckList item);

	/**
	 * TODO Acesso a a Notas
	 * 
	 */

	/**
	 * Notas - Ler nota para a lista recebendo seqLista
	 * 
	 * @param int
	 *            -- sequencia da lista para exibir a nota
	 * @return String -- texto com a nota
	 */
	public abstract String lerNota(int numLista);

	/**
	 * Notas - Ler a nota para a lista recebendo o nome da lista
	 * 
	 * @param String
	 *            -- nome da Lista para exibir a nota
	 * @return String -- nota
	 */
	public abstract String lerNota(String nomeLista);

	/*
	 * Notas - Atualiza nota na lista recebendo seqLista e a nota a ser gravada
	 * 
	 * @param int -- n�mero de sequencia da lista
	 * 
	 * @param String -- texto com a nota para grava��o
	 * 
	 * @throws SQLException
	 */
	public abstract void atualizaNota(int numLista, String nota)
			throws SQLException;

	/**
	 * Notas - Atualiza nota na lista recebendo nomeLista e a nota a ser gravada
	 * 
	 * @param int
	 *            -- nomeLista nome da lista para a atualiza��o da nota
	 * @param String
	 *            -- nota
	 */
	public abstract void atualizaNota(String nomeLista, String nota);

	/**
	 * TODO Acesso a dados FIREBASE
	 */

	/**
	 * �tem - Atualiza o �ten editado previamente
	 * 
	 * @param item
	 */

	public abstract void addListaFireBase(CheckList chkList);

}
