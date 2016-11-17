package mx.uach.smp.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ingrediente.class)
public abstract class Ingrediente_ extends mx.uach.smp.models.genericos.BaseModel_ {

	public static volatile SingularAttribute<Ingrediente, Double> existencia;
	public static volatile SingularAttribute<Ingrediente, String> unidad;
	public static volatile SingularAttribute<Ingrediente, Double> costoUnidad;
	public static volatile SingularAttribute<Ingrediente, Proveedor> proveedor;
	public static volatile SingularAttribute<Ingrediente, String> nombreIngrediente;

}

