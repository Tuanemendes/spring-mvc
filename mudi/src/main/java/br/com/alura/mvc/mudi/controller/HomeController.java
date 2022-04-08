package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Celular Smartphone OnePlus Nord 2 ");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61iYBaso-fL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Smartphone-OnePlus-Dimensity-Bluetooth/dp/B09TSGV5GM/ref=sr_1_2_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2A9JRNAO2PKDM&keywords=celular&qid=1649381229&sprefix=celula%2Caps%2C220&sr=8-2-spons&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyQlRZTjdNTkVXMzg2JmVuY3J5cHRlZElkPUEwMjk4NzQxMzY0SjNVOUhJQTlLNCZlbmNyeXB0ZWRBZElkPUEwMjY4Mzc1MU1GWkVZSDBOUUszQSZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
		pedido.setDescricao("Execelente telefone");
		
	    List<Pedido> pedidos =  Arrays.asList(pedido);
	    
	    model.addAttribute("pedidos",pedidos);
	    
		return "home";
	}
	
}
