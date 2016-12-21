package fr.apiscol.content.representations;

import fr.apiscol.content.searchEngine.ISearchEngineFactory;
import fr.apiscol.content.searchEngine.JerseySearchEngineFactory;
import fr.apiscol.content.searchEngine.SolrJSearchEngineFactory;

public class AbstractSearchEngineFactory {
	//TODO changer de package

	public enum SearchEngineType {
		JERSEY, SOLRJ
	};

	public static ISearchEngineFactory getSearchEngineFactory(
			SearchEngineType type) throws Exception {
		if (type == SearchEngineType.JERSEY)
			return new JerseySearchEngineFactory();
		else if (type == SearchEngineType.SOLRJ)
			return new SolrJSearchEngineFactory();
		throw new Exception("This search engine type is not implemented");
	}
}
