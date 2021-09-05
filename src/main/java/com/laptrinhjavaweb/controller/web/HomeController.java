package com.laptrinhjavaweb.controller.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.dto.SlideDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.BillDetailEntity;
import com.laptrinhjavaweb.entity.BillEntity;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IBillDetailService;
import com.laptrinhjavaweb.service.IBillService;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.IProductService;
import com.laptrinhjavaweb.service.IUserService;
import com.laptrinhjavaweb.service.impl.CartService;
import com.laptrinhjavaweb.service.impl.CategoryService;
import com.laptrinhjavaweb.service.impl.SlideService;
import com.laptrinhjavaweb.service.impl.UserService;

@Controller
public class HomeController extends BaseController {
	@Autowired
	private IProductService productService;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private SlideService slideService;
	
	@Autowired
	private ICategoryService categoryService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IBillService billService;
	
	@Autowired
	private IBillDetailService billDetailService;
	
	@RequestMapping(value="/trang-chu",method=RequestMethod.GET)
	public ModelAndView HomePage() {
		
		 _mav.setViewName("web/home");
		List<ProductDTO> list = productService.findAll();
		_mav.addObject("list", list);
		
		List<SlideDTO> slides = slideService.findAll();
		_mav.addObject("slides", slides);
		
		List<CategoryDTO> categories = categoryService.findAll();
		_mav.addObject("categories",categories);
		
		List<ProductDTO> newProduct = productService.findNewProduct(true);
		_mav.addObject("newProduct",newProduct);
		
		List<ProductDTO> highProduct = productService.findByHightLight(true);
		_mav.addObject("highProduct",highProduct);
		
		return _mav;
	}
	
	@RequestMapping(value="/san-pham/{id}/{page}/{limit}", method = RequestMethod.GET)
	public ModelAndView showList(@PathVariable int id,@PathVariable int page,@PathVariable int limit) {
		_mav.setViewName("web/product/list");
		ProductDTO pro = new ProductDTO();
		pro.setPage(page);
		pro.setLimit(limit);
		pro.setCategory_id(id);
		pro.setTotalItem((productService.findByCategoryId(id)).size());
		pro.setTotalPage((int) Math.ceil((double) pro.getTotalItem()/pro.getLimit()));
		Pageable pageable = new PageRequest(page-1, limit);
		pro.setListResult(productService.findByCategoryIdPageable(id, pageable));
		_mav.addObject("model",pro);
		_mav.addObject("total",pro.getTotalPage());

		return _mav;
	}
	
	@RequestMapping(value="/detail/{id}", method = RequestMethod.GET)
	public ModelAndView showListTest(@PathVariable int id) {
		ProductDTO product = productService.findOne(id);
		_mav.addObject("product", product);
		List<ProductDTO> productsRelatve = productService.findByCategoryId(product.getCategory_id());
		_mav.addObject("productsRelatve", productsRelatve);
		_mav.setViewName("web/product/detail_product");
		return _mav;
	}
	
	@RequestMapping(value="/addcart/{id}", method= RequestMethod.GET)
	public String showAddCart(HttpServletRequest request,HttpSession session , @PathVariable int id) {
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantity",cartService.TotalQuantity(cart) );
		session.setAttribute("totalPrice", cartService.TotalPrice(cart));
		
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value="/DeleteCart/{id}",method=RequestMethod.GET)
	public ModelAndView deleteCart(HttpServletRequest request,HttpSession session,@PathVariable int id) {
		_mav.setViewName("redirect:"+request.getHeader("Referer"));
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		if (cart==null) {
			return _mav;
		}
		cart = cartService.deleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantity",cartService.TotalQuantity(cart) );
		session.setAttribute("totalPrice", cartService.TotalPrice(cart));
		return _mav;
	}
	
	
	@RequestMapping(value="/list-cart",method = RequestMethod.GET)
	public ModelAndView showCart() {
		_mav.setViewName("web/cart/list_cart");
		return _mav;
	}
	
	@RequestMapping(value="/UpdateCart/{id}/{quantity}",method = RequestMethod.GET)
	public ModelAndView updateCart(HttpServletRequest request, HttpSession session, @PathVariable int id,@PathVariable int quantity) {
		_mav.setViewName("redirect:"+request.getHeader("Referer"));
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		if (cart==null) {
			return _mav;
		}
		cart = cartService.updateCart(id, quantity, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantity",cartService.TotalQuantity(cart) );
		session.setAttribute("totalPrice", cartService.TotalPrice(cart));
		return _mav;
	}
	
	@RequestMapping(value="/Register", method=RequestMethod.GET)
	public ModelAndView register() {
		_mav.setViewName("/web/account/register");
		_mav.addObject("user", new UserEntity());
		return _mav;
	}
	
	@RequestMapping(value="/Register", method=RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("user") UserEntity user) {
		_mav.setViewName("/web/account/register");
		userService.save(user);
		return _mav;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(HttpSession session,@ModelAttribute("user") UserEntity user) {
		
		UserEntity entity = userService.CheckAccount(user);
		if (entity!=null) {
			_mav.setViewName("redirect:trang-chu");
		}
		else {
			_mav.addObject("status", "Login is not successfull");
			_mav.setViewName("/web/account/register");
		}
		session.setAttribute("userLogin", entity);
		return _mav;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public  ModelAndView login(HttpSession session,HttpServletRequest request) {
		session.removeAttribute("userLogin");
		_mav.setViewName("redirect:"+request.getHeader("Referer"));	
		return _mav;
	}
	
	
	@RequestMapping(value="/Bill", method=RequestMethod.GET)
	public ModelAndView CreateBill() {
		ProductEntity detail = productRepo.findOne(5);
		_mav.addObject("model", detail);
		_mav.setViewName("/web/bill/bill");
		_mav.addObject("bills",new BillEntity());
		return _mav;
	}
	
	@RequestMapping(value="/Bill", method=RequestMethod.POST)
	public ModelAndView CreateBill1(HttpSession session, @ModelAttribute("bills") BillEntity bill) {
		
		
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		bill.setQuantity(cartService.TotalQuantity(cart));
		bill.setTotal(cartService.TotalPrice(cart));
		billService.SaveBill(bill);
		billDetailService.SaveDetailBill(cart);		
		return _mav;
	}
	

}
