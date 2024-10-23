import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Home, NoPage, Register } from "./Pages";

const App = () => {
  return (
  <>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/register" element={<Register />} />
        <Route path="*" element={<NoPage />} />
      </Routes>
    </BrowserRouter>
  </>
  );
}

export { App };
