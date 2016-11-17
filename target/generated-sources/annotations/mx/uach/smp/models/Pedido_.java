package mx.uach.smp.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.uach.smp.models.enums.EEstado;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ extends mx.uach.smp.models.genericos.BaseModel_ {

	public static volatile SingularAttribute<Pedido, Cliente> cliente;
	public static volatile SingularAttribute<Pedido, EEstado> estado;
	public static volatile SingularAttribute<Pedido, Date> fechaEntrega;
	public static volatile SingularAttribute<Pedido, Double> costoTotal;
	public static volatile SingularAttribute<Pedido, Date> fechaPedido;
	public static volatile SingularAttribute<Pedido, Integer> cantidad;
	public static volatile SingularAttribute<Pedido, Producto> producto;

}

