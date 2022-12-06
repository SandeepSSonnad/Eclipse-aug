package com.xworkz.abstraction.thing;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.LambdaConversionException;
import java.net.URISyntaxException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.activation.MimeTypeParseException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.management.modelmbean.XMLParseException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.transaction.xa.XAException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;
import org.xml.sax.SAXException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.javafx.geom.transform.NoninvertibleTransformException;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;

public class ExceptionSubClasses {
	
	void swift() throws AnnotationFormatError {
		System.out.println("Running Swift ");
		throw new AnnotationFormatError("Swift");
	}
	
	void car() throws AssertionError {
		System.out.println("Running car Method");
		throw new AssertionError();
	}
	
	void one() throws AWTError {
		System.out.println("Running One Method");
		throw new AWTError("One");
	}
	
	void two() throws CoderMalfunctionError {
		System.out.println("Running Two Method");
		throw new CoderMalfunctionError(null);
	}
	
	void three() throws FactoryConfigurationError {
		System.out.println("Running Three Method");
		throw new FactoryConfigurationError();
	}
	
	void four() throws FactoryConfigurationError {
		System.out.println("Running Four Method");
		throw new FactoryConfigurationError();
	}
	
	void five() throws IOError {
		System.out.println("Running five Method");
		throw new IOError(null);
	}
	
	void six() throws LinkageError {
		System.out.println("Running six Method");
		throw new LinkageError(null);
	}
	
	void seveen() throws BootstrapMethodError {
		System.out.println("Running seveen Method");
		throw new BootstrapMethodError();
	}
	
	void eight() throws ClassCircularityError {
		System.out.println("Running eight Method");
		throw new ClassCircularityError();
	}
	
	void nine() throws ClassFormatError {
		System.out.println("Running nine Method");
		throw new ClassFormatError();
	}
	
	void ten() throws ExceptionInInitializerError {
		System.out.println("Running ten Method");
		throw new ExceptionInInitializerError();
	}
	
	void eleven() throws IncompatibleClassChangeError {
		System.out.println("Running Eleven Method");
		throw new IncompatibleClassChangeError();
	}
	
	void twelev() throws NoClassDefFoundError {
		System.out.println("Running twelev Method");
		throw new NoClassDefFoundError();
	}

	void thirtneen() throws UnsatisfiedLinkError {
		System.out.println("Running thirtneen Method");
		throw new UnsatisfiedLinkError();
	}

	void fourteen() throws VerifyError {
		throw new VerifyError();
	}
	
	void fifteen() throws ServiceConfigurationError {
		throw new ServiceConfigurationError(" ");
	}
	
	void sixteen() throws ThreadDeath {
		throw new ThreadDeath();
	}

	void seventeen() throws TransformerFactoryConfigurationError {
		throw new TransformerFactoryConfigurationError();
	}
	
	void eighteen() throws VirtualMachineError {
		throw new VirtualMachineError() {};
	}
	
	void ninteen() throws SchemaFactoryConfigurationError {
		throw new SchemaFactoryConfigurationError();
	}
	
	void twenty() throws ThreadDeath {
		throw new ThreadDeath();
	}
	void twentyOne() throws InternalError {
		throw new InternalError();
	}
	
	void twentyTwo() throws OutOfMemoryError {
		throw new OutOfMemoryError();
	}
	
	void twentyThree() throws StackOverflowError {
		throw new StackOverflowError();
	}
	
	void twentyFour() throws UnknownError {
		throw new UnknownError();
	}
	
	void twentyFive() throws FactoryConfigurationError {
		throw new FactoryConfigurationError();
	}
	
	void twentySix() throws AclNotFoundException {
		throw new AclNotFoundException();
	}
	
	void twentySeveen() throws ActivationException {
		throw new ActivationException();
	}
	
	void twentyEight() throws AlreadyBoundException {
		throw new AlreadyBoundException();
	}
	
	void twentyNine() throws ApplicationException {
		throw new ApplicationException(" ",null);
	}
	
	void thirty() throws AWTException {
		throw new AWTException(" ");
	}
	
	void thirtyOne() throws BackingStoreException {
		throw new BackingStoreException("d");
	}
	
	void thirtyTwo() throws BadAttributeValueExpException {
		throw new BadAttributeValueExpException("d");
	}
	
	void thirtyThree() throws BadBinaryOpValueExpException {
		throw new BadBinaryOpValueExpException(null);
	}
	
	void thirtyFour() throws BadLocationException {
		throw new BadLocationException("s",34);
	}
	
	void thirtyFive() throws BadStringOperationException {
		throw new BadStringOperationException("s");
	}
	
	void thirtySix() throws BrokenBarrierException {
		throw new BrokenBarrierException();
	}
	
	void thirtySeveen() throws CertificateException {
		throw new CertificateException();
	}
	
	void thirtyEight() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	void thirtyNine() throws DataFormatException {
		throw new DataFormatException();
	}
	
	void fourty() throws XPathException {
		throw new XPathException();
	}

	void fourtyOne() throws DatatypeConfigurationException {
		throw new DatatypeConfigurationException();
	}
	
	void fourtyTwo() throws DestroyFailedException {
		throw new DestroyFailedException();
	}
	
	void fourtyThree() throws ExecutionException {
		throw new ExecutionException(null);
	}
	
	void fourtyFour() throws ExpandVetoException {
		throw new ExpandVetoException(null);
	}
	
	void fourtyFive() throws FontFormatException {
		throw new FontFormatException("");
	}
	
	void fourtySix() throws GeneralSecurityException {
		throw new GeneralSecurityException();
	}
	
	void fourtySeveen() throws GSSException {
		throw new GSSException(1234);
	}
	
	void fourtyEight() throws IllegalClassFormatException {
		throw new IllegalClassFormatException();
	}
	
	void fourtyNine() throws InterruptedException {
		throw new InterruptedException();
	}
	
	void fifty() throws IntrospectionException {
		throw new IntrospectionException();
	}
	
	void fiftyOne() throws InvalidApplicationException {
		throw new InvalidApplicationException(" ");
	}
	
	void fiftyTwo() throws InvalidMidiDataException {
		throw new InvalidMidiDataException();
	}
	
	void fiftyThree() throws InvalidPreferencesFormatException {
		throw new InvalidPreferencesFormatException(" ");
	}
	
	void fiftyFour() throws InvalidTargetObjectTypeException {
		throw new InvalidTargetObjectTypeException();
	}
	
	void fiftyFive() throws IOException {
		throw new IOException();
	}
	
	void fiftySix() throws JAXBException {
		throw new JAXBException(" ");
	}
	
	void fiftySeveen() throws JMException {
		throw new JMException();
	}
	
	void fiftyEight() throws KeySelectorException {
		throw new KeySelectorException();
	}
	
	void fiftyNine() throws LambdaConversionException {
		throw new LambdaConversionException();
	}
	
	void sixty() throws LastOwnerException {
		throw new LastOwnerException();
	}
	
	void sixtyOne() throws NoninvertibleTransformException {
		throw new NoninvertibleTransformException("");
	}
	
	void sixtyTwo() throws LineUnavailableException {
		throw new LineUnavailableException();
	}
	
	void sixtyThree() throws MarshalException {
		throw new MarshalException();
	}
	
	void sixtyFour() throws MidiUnavailableException {
		throw new MidiUnavailableException();
	}
	
	void sixtyFive() throws MimeTypeParseException {
		throw new MimeTypeParseException();
	}
	
	void sixtySix() throws MimeTypeParseException {
		throw new MimeTypeParseException();
	}
	
	void sixtySeveen() throws NamingException {
		throw new NamingException();
	}
	
	void sixtyEight() throws NotBoundException {
		throw new NotBoundException();
	}
	
	void sixtyNine() throws NotOwnerException {
		throw new NotOwnerException();
	}
	
	void seventy() throws ParseException {
		throw new ParseException();
	}
	
	void seventyOne() throws ParserConfigurationException {
		throw new ParserConfigurationException();
	}
	
	void seventyTwo() throws PrinterException {
		throw new PrinterException();
	}
	
	void seventyThree() throws PrintException {
		throw new PrintException();
	}
	
	void seventyFour() throws PrivilegedActionException {
		throw new PrivilegedActionException(null);
	}
	
	void seventyFive() throws PropertyVetoException {
		throw new PropertyVetoException("s",null);
	}
	
	void seventySix() throws ReflectiveOperationException {
		throw new ReflectiveOperationException();
	}
	
	void seventySeveen() throws RefreshFailedException {
		throw new RefreshFailedException();
	}
	
	void seventyEight() throws RemarshalException {
		throw new RemarshalException();
	}
	
	void seventyNine() throws RuntimeException {
		throw new RuntimeException();
	}
	
	void eighty() throws SAXException {
		throw new SAXException();
	}
	
	void eightyOne() throws ServerNotActiveException {
		throw new ServerNotActiveException();
	}
	
	void eightyTwo() throws SOAPException {
		throw new SOAPException();
	}
	
	void eightyThree() throws SQLException {
		throw new SQLException();
	}
	
	void eightyFour() throws TimeoutException {
		throw new TimeoutException();
	}
	
	void eightyFive() throws TooManyListenersException {
		throw new TooManyListenersException();
	}
	
	void eightySix() throws TransformerException {
		throw new TransformerException("");
	}
	
	void eightySeveen() throws TransformException {
		throw new TransformException();
	}
	
	void eightyEight() throws UnmodifiableClassException {
		throw new UnmodifiableClassException();
	}
	
	void eightyNine() throws UnsupportedAudioFileException {
		throw new UnsupportedAudioFileException();
	}
	
	void ninty() throws UnsupportedCallbackException {
		throw new UnsupportedCallbackException(null);
	}
	
	void nintyOne() throws ScriptException {
		throw new ScriptException(" ");
	}
	
	void nintyTwo() throws UnsupportedFlavorException {
		throw new UnsupportedFlavorException(null);
	}
	
	void nintyThree() throws UnsupportedLookAndFeelException {
		throw new UnsupportedLookAndFeelException("");
	}
	
	void nintyFour() throws URIReferenceException {
		throw new URIReferenceException();
	}
	
	void nintyFive() throws URISyntaxException {
		throw new URISyntaxException("s"," ");
	}
	
	void nintySix() throws UserException {
		throw new UserException() {
		}; 
	}
	
	void nintySeveen() throws XAException {
		throw new XAException();
	}
	
	void nintyEight() throws XMLParseException {
		throw new XMLParseException();
	}
	
	void nintyNine() throws XMLSignatureException {
		throw new XMLSignatureException();
	}
	
	void hundred() throws XMLStreamException {
		throw new XMLStreamException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
