package jogovelha;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/beans.xml");
		BeanFactory factory = context;
		Jogo jogo = (Jogo) factory
				.getBean("jogo");
		
	//	jogo.jogar(0, Tile.XIS);
		jogo.imprimir();
		

	}

}
