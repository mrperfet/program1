package shopping.mall;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer_Service_Controller
{
	@Autowired
	private Customer_Service service;
	@GetMapping("/customerservice")
	public java.util.List<customer> list()
	{
		return service.listAll();
	}
	@GetMapping("/customer/{c_id}")
	public ResponseEntity<customer> get(@PathVariable Integer c_id)
	{
		try
		{
			customer c=service.get(c_id);
			return new ResponseEntity<customer>(c,HttpStatus.OK);
		}
		catch (NoResultException e)
		{
			return new ResponseEntity<customer>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/customerservice")
	public void add(@RequestBody customer c)
	{
		service.save(c);
	}
	@PutMapping("/customerservice/{c_id}")
	public ResponseEntity<?> update(@RequestBody customer c, @PathVariable Integer c_id)
	{
		customer existu=service.get(c_id);
		service.save(existu);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/customerservice/{c_id}")
	public void delete(@PathVariable Integer c_id)
	{
		service.delete(c_id);
	}
}
