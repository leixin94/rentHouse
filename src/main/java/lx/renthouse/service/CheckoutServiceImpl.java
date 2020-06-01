package lx.renthouse.service;

import java.util.List;

import lx.renthouse.Pojo.Checkout;
import lx.renthouse.dao.CheckoutMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CheckoutServiceImpl implements CheckoutService {

	@Autowired
	private CheckoutMapper checkoutMapper;

	@Override
	public void insertcheckout(Checkout checkout) {
		checkoutMapper.insertcheckout(checkout);

	}

	@Override
	public List<Checkout> getallcheckout() {
		List<Checkout> checkout=checkoutMapper.getallcheckout();
		return checkout;
	}

	@Override
	public void deletecheckout(Integer id) {

		checkoutMapper.deletecheckout(id);
	}


}
