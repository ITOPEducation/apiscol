package fr.apiscol.meta.representations;

import javax.servlet.ServletContext;

public interface IEntitiesRepresentationBuilderFactory {

	IEntitiesRepresentationBuilder<?> getRepresentationBuilder(
			String requestedFormat, ServletContext context);

}
